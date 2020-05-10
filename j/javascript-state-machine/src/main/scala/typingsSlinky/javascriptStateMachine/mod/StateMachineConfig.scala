package typingsSlinky.javascriptStateMachine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachineConfig extends js.Object {
  var callbacks: js.UndefOr[
    StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[String], 
        /* from */ js.UndefOr[String], 
        /* to */ js.UndefOr[String], 
        /* repeated */ js.Any, 
        _
      ]
    ]
  ] = js.native
  var error: js.UndefOr[StateMachineErrorCallback] = js.native
   // string or { state: 'foo', event: 'setup', defer: true|false }
  var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.native
  var initial: js.UndefOr[js.Any] = js.native
  var target: js.UndefOr[StateMachine] = js.native
}

object StateMachineConfig {
  @scala.inline
  def apply(): StateMachineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateMachineConfig]
  }
  @scala.inline
  implicit class StateMachineConfigOps[Self <: StateMachineConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbacks(
      value: StringDictionary[
          js.Function4[
            /* event */ js.UndefOr[String], 
            /* from */ js.UndefOr[String], 
            /* to */ js.UndefOr[String], 
            /* repeated */ js.Any, 
            _
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withError(
      value: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[js.Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[js.Error]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[StateMachineEventDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: StateMachine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

