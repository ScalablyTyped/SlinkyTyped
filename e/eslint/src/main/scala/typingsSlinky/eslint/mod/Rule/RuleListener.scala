package typingsSlinky.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleListener
  extends NodeListener
     with /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] {
  var onCodePathEnd: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.native
  var onCodePathSegmentEnd: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.native
  var onCodePathSegmentLoop: js.UndefOr[
    js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ Node, 
      Unit
    ]
  ] = js.native
  var onCodePathSegmentStart: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.native
  var onCodePathStart: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.native
}

object RuleListener {
  @scala.inline
  def apply(): RuleListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleListener]
  }
  @scala.inline
  implicit class RuleListenerOps[Self <: RuleListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCodePathEnd(value: (/* codePath */ CodePath, /* node */ Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCodePathEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCodePathSegmentEnd(value: (/* segment */ CodePathSegment, /* node */ Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCodePathSegmentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCodePathSegmentLoop(
      value: (/* fromSegment */ CodePathSegment, /* toSegment */ CodePathSegment, /* node */ Node) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentLoop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCodePathSegmentLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCodePathSegmentStart(value: (/* segment */ CodePathSegment, /* node */ Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCodePathSegmentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathSegmentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCodePathStart(value: (/* codePath */ CodePath, /* node */ Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCodePathStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCodePathStart")(js.undefined)
        ret
    }
  }
  
}

