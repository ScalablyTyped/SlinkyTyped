package typingsSlinky.monacoEditor

import typingsSlinky.monacoEditor.monacoEditorStrings.error
import typingsSlinky.monacoEditor.monacoEditorStrings.ignore
import typingsSlinky.monacoEditor.monacoEditorStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgumentsInColorFunction extends js.Object {
  val argumentsInColorFunction: js.UndefOr[ignore | warning | error] = js.native
  val boxModel: js.UndefOr[ignore | warning | error] = js.native
  val compatibleVendorPrefixes: js.UndefOr[ignore | warning | error] = js.native
  val duplicateProperties: js.UndefOr[ignore | warning | error] = js.native
  val emptyRules: js.UndefOr[ignore | warning | error] = js.native
  val float: js.UndefOr[ignore | warning | error] = js.native
  val fontFaceProperties: js.UndefOr[ignore | warning | error] = js.native
  val hexColorLength: js.UndefOr[ignore | warning | error] = js.native
  val idSelector: js.UndefOr[ignore | warning | error] = js.native
  val ieHack: js.UndefOr[ignore | warning | error] = js.native
  val importStatement: js.UndefOr[ignore | warning | error] = js.native
  val important: js.UndefOr[ignore | warning | error] = js.native
  val propertyIgnoredDueToDisplay: js.UndefOr[ignore | warning | error] = js.native
  val universalSelector: js.UndefOr[ignore | warning | error] = js.native
  val unknownProperties: js.UndefOr[ignore | warning | error] = js.native
  val unknownVendorSpecificProperties: js.UndefOr[ignore | warning | error] = js.native
  val vendorPrefix: js.UndefOr[ignore | warning | error] = js.native
  val zeroUnits: js.UndefOr[ignore | warning | error] = js.native
}

object AnonArgumentsInColorFunction {
  @scala.inline
  def apply(): AnonArgumentsInColorFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArgumentsInColorFunction]
  }
  @scala.inline
  implicit class AnonArgumentsInColorFunctionOps[Self <: AnonArgumentsInColorFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentsInColorFunction(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentsInColorFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentsInColorFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentsInColorFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxModel(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxModel")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibleVendorPrefixes(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleVendorPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleVendorPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleVendorPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateProperties(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyRules(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyRules")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFaceProperties(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFaceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFaceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFaceProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withHexColorLength(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColorLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexColorLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexColorLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIdSelector(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withIeHack(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIeHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieHack")(js.undefined)
        ret
    }
    @scala.inline
    def withImportStatement(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withImportant(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyIgnoredDueToDisplay(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyIgnoredDueToDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyIgnoredDueToDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyIgnoredDueToDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withUniversalSelector(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniversalSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownProperties(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownVendorSpecificProperties(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownVendorSpecificProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownVendorSpecificProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownVendorSpecificProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorPrefix(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroUnits(value: ignore | warning | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroUnits")(js.undefined)
        ret
    }
  }
  
}

