package typingsSlinky.reactWait.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseWaitAPI extends js.Object {
  /**
    * Using Wait Component
    *
    * ```tsx
    * function Component() {
    *   const { Wait } = useWait();
    *   return (
    *     <Wait on="the waiting message" fallback={<div>Waiting...</div>}>
    *       The content after waiting done
    *     </Wait>
    *   );
    * }
    * ```
    *
    * Better example for a button with loading state:
    * ```tsx
    * <button disabled={isWaiting("creating user")}>
    *   <Wait on="creating user" fallback={<div>Creating User...</div>}>
    *     Create User
    *   </Wait>
    * </button>
    * ```
    */
  var Wait: ReactComponentClass[WaitProps] = js.native
  /**
    * Returns an array of waiters.
    */
  var waiters: js.Array[String] = js.native
  /**
    * Returns boolean value if any loader exists in context.
    *
    * ```tsx
    * const { anyWaiting } = useWait();
    * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
    * ```
    */
  def anyWaiting(): Boolean = js.native
  /**
    * Creates a waiting context.
    *
    * ```tsx
    * const { startWaiting, endWaiting, isWaiting, Wait } = createWaitingContext("creating user");
    *  return (
    *   <button disabled={isWaiting()}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def createWaitingContext(waiter: String): WaitingContext = js.native
  /**
    * Stops the given waiter.
    *
    * ```tsx
    * const { end } = useWait();
    * return <button onClick={() => endWaiting("message")}>Stop</button>;
    * ```
    */
  def endWaiting(waiter: String): Unit = js.native
  /**
    * Returns boolean value if given loader exists in context.
    *
    * ```tsx
    * const { isWaiting } = useWait();
    * return (
    *   <button disabled={isWaiting("creating user")}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def isWaiting(waiter: String): Boolean = js.native
  /**
    * Starts the given waiter.
    *
    * ```tsx
    * const { startWaiting } = useWait();
    * return <button onClick={() => startWaiting("message")}>Start</button>;
    * ```
    */
  def startWaiting(waiter: String): Unit = js.native
}

object UseWaitAPI {
  @scala.inline
  def apply(
    Wait: ReactComponentClass[WaitProps],
    anyWaiting: () => Boolean,
    createWaitingContext: String => WaitingContext,
    endWaiting: String => Unit,
    isWaiting: String => Boolean,
    startWaiting: String => Unit,
    waiters: js.Array[String]
  ): UseWaitAPI = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], anyWaiting = js.Any.fromFunction0(anyWaiting), createWaitingContext = js.Any.fromFunction1(createWaitingContext), endWaiting = js.Any.fromFunction1(endWaiting), isWaiting = js.Any.fromFunction1(isWaiting), startWaiting = js.Any.fromFunction1(startWaiting), waiters = waiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseWaitAPI]
  }
  @scala.inline
  implicit class UseWaitAPIOps[Self <: UseWaitAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWait(value: ReactComponentClass[WaitProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyWaiting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyWaiting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateWaitingContext(value: String => WaitingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWaitingContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndWaiting(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWaiting(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartWaiting(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaiters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

