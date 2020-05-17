package typingsSlinky.reactTransitionGroup.anon

import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNames extends js.Object {
  /**
    * The animation `classNames` applied to the component as it enters or exits.
    * A single name can be provided and it will be suffixed for each stage: e.g.
    *
    * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
    * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
    *
    * Each individual classNames can also be specified independently like:
    *
    * ```js
    * classNames={{
    *   appear: 'my-appear',
    *   appearActive: 'my-appear-active',
    *   appearDone: 'my-appear-done',
    *   enter: 'my-enter',
    *   enterActive: 'my-enter-active',
    *   enterDone: 'my-enter-done',
    *   exit: 'my-exit',
    *   exitActive: 'my-exit-active',
    *   exitDone: 'my-exit-done'
    * }}
    * ```
    */
  var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.native
}

object ClassNames {
  @scala.inline
  def apply(): ClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNames]
  }
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: String | CSSTransitionClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
  }
  
}

