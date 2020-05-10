package typingsSlinky.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindToStateOptions extends js.Object {
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[Boolean] = js.native
  /**
    * The context of your component.
    */
  var context: js.Object = js.native
  /**
    * A callback function that will be invoked if the current user does
    * not have read permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.native
  /**
    * The state property you want to sync with Firebase; can be an
    * arbitrarily nested property a là `foo.bar` (no arrays).
    */
  var state: String = js.native
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with bindToState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.native
}

object BindToStateOptions {
  @scala.inline
  def apply(context: js.Object, state: String): BindToStateOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindToStateOptions]
  }
  @scala.inline
  implicit class BindToStateOptionsOps[Self <: BindToStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asArray")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withThen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutThen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.undefined)
        ret
    }
  }
  
}

