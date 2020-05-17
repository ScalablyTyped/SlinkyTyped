package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /*This causes the message with id n to be removed after the given delay, in milliseconds. The default delay is
    * 600 milliseconds.*/
  def Clear(n: Double, delay: Double): Unit = js.native
  /*This sets the message area to a “Loading file” message, where file is the name of the file (with [MathJax]
    * representing the root directory).
    */
  def File(file: String): Double = js.native
  /*Returns a string of all the messages issued so far, separated by newlines. This is used in debugging MathJax
    * operations.
    */
  def Log(): String = js.native
  /*This removes the message frame from the window (it will reappear when future messages are set, however).*/
  def Remove(): Unit = js.native
  /*This sets the message being displayed to the given message string. If n is not null, it represents a message
    * id number and the text is set for that message id, otherwise a new id number is created for this message. If
    * delay is provided, it is the time (in milliseconds) to display the message before it is cleared. If delay is
    * not provided, the message will not be removed automatically; you must call the MathJax.Messsage.Clear() method
    * by hand to remove it. If message is an array, then it represents a localizable string, as described in the
    * Localization strings documentation.
    */
  def Set(message: String, n: Double, delay: Double): Double = js.native
  /*This method is called on each message before it is displayed. It can be used to modify (e.g., shorten) the
    * various messages before they are displayed. The default action is to check if the messageStyle configuration
    * parameter is simple, and if so, convert loading and processing messages to a simpler form. This method can be
    * overridden to perform other sanitization of the message strings.
    */
  def filterText(text: String, n: Double): String = js.native
}

object Message {
  @scala.inline
  def apply(
    Clear: (Double, Double) => Unit,
    File: String => Double,
    Log: () => String,
    Remove: () => Unit,
    Set: (String, Double, Double) => Double,
    filterText: (String, Double) => String
  ): Message = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction2(Clear), File = js.Any.fromFunction1(File), Log = js.Any.fromFunction0(Log), Remove = js.Any.fromFunction0(Remove), Set = js.Any.fromFunction3(Set), filterText = js.Any.fromFunction2(filterText))
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFile(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Log")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFilterText(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

