package typingsSlinky.reactDashBootstrap.libPaginationPrevMod

import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPrevProps
  extends AllHTMLAttributes[PaginationPrev]
     with ClassAttributes[PaginationPrev]

object PaginationPrevProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationPrev] = null,
    ClassAttributes: ClassAttributes[PaginationPrev] = null
  ): PaginationPrevProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationPrevProps]
  }
}

