package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.anon.Delay
import typingsSlinky.puppeteer.anon.Text
import typingsSlinky.puppeteer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyboard extends StObject {
  
  /**
    * Dispatches a keydown event.
    * @param key Name of key to press, such as ArrowLeft.
    * @param options Specifies a input text event.
    */
  def down(key: String): js.Promise[Unit] = js.native
  def down(key: String, options: Text): js.Promise[Unit] = js.native
  
  /** Shortcut for `keyboard.down` and `keyboard.up`. */
  def press(key: String): js.Promise[Unit] = js.native
  def press(key: String, options: Delay): js.Promise[Unit] = js.native
  
  /** Dispatches a `keypress` and `input` event. This does not send a `keydown` or keyup `event`. */
  def sendCharacter(char: String): js.Promise[Unit] = js.native
  
  /**
    * Sends a keydown, keypress/input, and keyup event for each character in the text.
    * @param text A text to type into a focused element.
    * @param options Specifies the typing options.
    */
  def `type`(text: String): js.Promise[Unit] = js.native
  def `type`(text: String, options: `0`): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a keyup event.
    * @param key Name of key to release, such as ArrowLeft.
    */
  def up(key: String): js.Promise[Unit] = js.native
}
