package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
  var halfChecked: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
}

object Checked {
  @scala.inline
  def apply(
    checked: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ],
    halfChecked: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckedVarargs(value: js.Any*): Self = this.set("checked", js.Array(value :_*))
    @scala.inline
    def setChecked(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedVarargs(value: js.Any*): Self = this.set("halfChecked", js.Array(value :_*))
    @scala.inline
    def setHalfChecked(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
  }
  
}

