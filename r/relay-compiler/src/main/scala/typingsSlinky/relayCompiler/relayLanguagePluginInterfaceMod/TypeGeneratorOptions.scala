package typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod

import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.relayFlowTypeTransformersMod.ScalarTypeMapping
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeGeneratorOptions extends js.Object {
  /**
    * A map of custom scalars to scalars that the plugin knows about and emits
    * type information for.
    *
    * @example
    *
    *  // The URL custom scalar is essentially a string and should be treated as
    *  // such by the language’s type system.
    *  { URL: 'String' }
    */
  val customScalars: ScalarTypeMapping = js.native
  /**
    * Import flow types from the Haste-style global module name or per-enum
    * global module name given by the function variant.
    */
  val enumsHasteModule: js.UndefOr[String | (js.Function1[/* enumName */ String, String])] = js.native
  /**
    * Lists all other fragments relay-compiler knows about. Use this to know when
    * to import/reference other artifacts.
    */
  val existingFragmentNames: Set[String] = js.native
  /**
    * This option controls whether or not a catch-all entry is added to enum type
    * definitions for values that may be added in the future. Enabling this means
    * you will have to update your application whenever the GraphQL server schema
    * adds new enum values to prevent it from breaking.
    *
    * This defaults to `false`.
    */
  val noFutureProofEnums: Boolean = js.native
  /**
    * Optional normalization IR for generating raw response
    */
  val normalizationIR: js.UndefOr[Root] = js.native
  /**
    * @todo Document this.
    */
  val optionalInputFields: js.Array[String] = js.native
  /**
    * Whether or not the Haste module system is being used. This will currently
    * always be `false` for OSS users.
    */
  val useHaste: Boolean = js.native
  /**
    * Whether or not relay-compiler will store artifacts next to the module that
    * they originate from or all together in a single directory.
    *
    * Storing all artifacts in a single directory makes it easy to import and
    * reference fragments defined in other artifacts without needing to use the
    * Haste module system.
    *
    * This defaults to `false`.
    */
  val useSingleArtifactDirectory: Boolean = js.native
}

object TypeGeneratorOptions {
  @scala.inline
  def apply(
    customScalars: ScalarTypeMapping,
    existingFragmentNames: Set[String],
    noFutureProofEnums: Boolean,
    optionalInputFields: js.Array[String],
    useHaste: Boolean,
    useSingleArtifactDirectory: Boolean
  ): TypeGeneratorOptions = {
    val __obj = js.Dynamic.literal(customScalars = customScalars.asInstanceOf[js.Any], existingFragmentNames = existingFragmentNames.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], optionalInputFields = optionalInputFields.asInstanceOf[js.Any], useHaste = useHaste.asInstanceOf[js.Any], useSingleArtifactDirectory = useSingleArtifactDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeGeneratorOptions]
  }
  @scala.inline
  implicit class TypeGeneratorOptionsOps[Self <: TypeGeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomScalars(value: ScalarTypeMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExistingFragmentNames(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingFragmentNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoFutureProofEnums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFutureProofEnums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalInputFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalInputFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseHaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSingleArtifactDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSingleArtifactDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumsHasteModuleFunction1(value: /* enumName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumsHasteModule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnumsHasteModule(value: String | (js.Function1[/* enumName */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumsHasteModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumsHasteModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumsHasteModule")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizationIR(value: Root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationIR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizationIR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationIR")(js.undefined)
        ret
    }
  }
  
}

