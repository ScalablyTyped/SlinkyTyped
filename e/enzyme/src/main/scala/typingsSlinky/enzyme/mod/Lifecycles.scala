package typingsSlinky.enzyme.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.enzyme.anon.Dictkey
import typingsSlinky.enzyme.anon.HasShouldComponentUpdateBug
import typingsSlinky.enzyme.anon.OnSetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lifecycles
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var componentDidUpdate: js.UndefOr[OnSetState] = js.native
  var getChildContext: js.UndefOr[Dictkey] = js.native
  var getDerivedStateFromProps: js.UndefOr[HasShouldComponentUpdateBug | Boolean] = js.native
  var setState: js.UndefOr[js.Any] = js.native
}

object Lifecycles {
  @scala.inline
  def apply(): Lifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycles]
  }
  @scala.inline
  implicit class LifecyclesOps[Self <: Lifecycles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDidUpdate(value: OnSetState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildContext(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetChildContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildContext")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDerivedStateFromProps(value: HasShouldComponentUpdateBug | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDerivedStateFromProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.undefined)
        ret
    }
  }
  
}

