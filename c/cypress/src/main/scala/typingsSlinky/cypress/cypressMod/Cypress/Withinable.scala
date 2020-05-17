package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cypress.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how a command behaves in the `within` scope.
  * These options will determine how nodes are selected.
  */
@js.native
trait Withinable extends js.Object {
  /**
    * Element to search for children in. If null, search begins from root-level DOM element.
    *
    * @default depends on context, null if outside of within wrapper
    */
  var withinSubject: JQuery[HTMLElement] | HTMLElement | Null = js.native
}

object Withinable {
  @scala.inline
  def apply(): Withinable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Withinable]
  }
  @scala.inline
  implicit class WithinableOps[Self <: Withinable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithinSubjectHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithinSubject(value: JQuery[HTMLElement] | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithinSubjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinSubject")(null)
        ret
    }
  }
  
}

