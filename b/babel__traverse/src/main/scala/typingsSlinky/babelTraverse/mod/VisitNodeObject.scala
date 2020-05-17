package typingsSlinky.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitNodeObject[S, P] extends VisitNode[S, P] {
  var enter: js.UndefOr[VisitNodeFunction[S, P]] = js.native
  var exit: js.UndefOr[VisitNodeFunction[S, P]] = js.native
}

object VisitNodeObject {
  @scala.inline
  def apply[S, P](): VisitNodeObject[S, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitNodeObject[S, P]]
  }
  @scala.inline
  implicit class VisitNodeObjectOps[Self[s, p] <: VisitNodeObject[s, p], S, P] (val x: Self[S, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, P]) with Other]
    @scala.inline
    def withEnter(value: VisitNodeFunction[S, P]): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: VisitNodeFunction[S, P]): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
  }
  
}

