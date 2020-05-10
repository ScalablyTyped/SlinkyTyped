package typingsSlinky.babylonjs.shaderProcessingOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.iShaderProcessorMod.IShaderProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingOptions extends js.Object {
  var defines: js.Array[String] = js.native
  var includesShadersStore: StringDictionary[String] = js.native
  var indexParameters: js.Any = js.native
  var isFragment: Boolean = js.native
  var lookForClosingBracketForUniformBuffer: js.UndefOr[Boolean] = js.native
  var platformName: String = js.native
  var processor: js.UndefOr[IShaderProcessor] = js.native
  var shadersRepository: String = js.native
  var shouldUseHighPrecisionShader: Boolean = js.native
  var supportsUniformBuffers: Boolean = js.native
  var version: String = js.native
}

object ProcessingOptions {
  @scala.inline
  def apply(
    defines: js.Array[String],
    includesShadersStore: StringDictionary[String],
    indexParameters: js.Any,
    isFragment: Boolean,
    platformName: String,
    shadersRepository: String,
    shouldUseHighPrecisionShader: Boolean,
    supportsUniformBuffers: Boolean,
    version: String
  ): ProcessingOptions = {
    val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], includesShadersStore = includesShadersStore.asInstanceOf[js.Any], indexParameters = indexParameters.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], shadersRepository = shadersRepository.asInstanceOf[js.Any], shouldUseHighPrecisionShader = shouldUseHighPrecisionShader.asInstanceOf[js.Any], supportsUniformBuffers = supportsUniformBuffers.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOptions]
  }
  @scala.inline
  implicit class ProcessingOptionsOps[Self <: ProcessingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludesShadersStore(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includesShadersStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadersRepository(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadersRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldUseHighPrecisionShader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseHighPrecisionShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsUniformBuffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUniformBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookForClosingBracketForUniformBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookForClosingBracketForUniformBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookForClosingBracketForUniformBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookForClosingBracketForUniformBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessor(value: IShaderProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(js.undefined)
        ret
    }
  }
  
}

