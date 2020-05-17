package typingsSlinky.antd.anon

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Success extends js.Object {
  var error: ForwardRefExoticComponent[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
  var info: ForwardRefExoticComponent[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
  var success: ForwardRefExoticComponent[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
  var warning: ForwardRefExoticComponent[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
}

object Success {
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
    ],
    info: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
    ],
    success: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
    ],
    warning: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
    ]
  ): Success = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  @scala.inline
  implicit class SuccessOps[Self <: Success] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(
      value: ForwardRefExoticComponent[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(
      value: ForwardRefExoticComponent[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(
      value: ForwardRefExoticComponent[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(
      value: ForwardRefExoticComponent[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

