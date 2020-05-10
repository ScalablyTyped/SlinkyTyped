package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxySpec[D /* <: ProxyData */, T, S] extends js.Object {
  /**
    * Callbacks for getting notified about events.
    */
  var events: js.UndefOr[ProxyEventCallbacks[D, T, S]] = js.native
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.native
  /**
    * Name of the proxy class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocols this proxy class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
}

object ProxySpec {
  @scala.inline
  def apply[D, T, S](): ProxySpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxySpec[D, T, S]]
  }
  @scala.inline
  implicit class ProxySpecOps[Self[d, t, s] <: ProxySpec[d, t, s], D, T, S] (val x: Self[D, T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T, S]) with Other]
    @scala.inline
    def withEvents(value: ProxyEventCallbacks[D, T, S]): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(
      value: StringDictionary[
          (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
        ]
    ): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[Protocol]): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
  }
  
}

