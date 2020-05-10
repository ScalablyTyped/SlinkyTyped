package typingsSlinky.extjs.Ext.layout.component.field

import typingsSlinky.extjs.Ext.layout.component.IAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Object) */
  var elementId: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var errorStrategies: js.UndefOr[js.Any] = js.native
  /** [Method] Return the set of strategy functions from the errorStrategies collection that is appropriate for the field s msgTarge  */
  var getErrorStrategy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Return the set of strategy functions from the labelStrategies collection that is appropriate for the field s labelAli  */
  var getLabelStrategy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var labelStrategies: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var left: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var qtip: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var right: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var side: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var title: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var top: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var under: js.UndefOr[js.Any] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginLayoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayoutCycle")(js.undefined)
        ret
    }
    @scala.inline
    def withElementId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStrategies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStrategies")(js.undefined)
        ret
    }
    @scala.inline
    def withGetErrorStrategy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetErrorStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelStrategy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelStrategy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStrategies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStrategies")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withQtip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQtip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtip")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withUnder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("under")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("under")(js.undefined)
        ret
    }
  }
  
}

