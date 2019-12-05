package typingsSlinky.npm.npmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NPM {
  import org.scalablytyped.runtime.StringDictionary

  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[js.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* result2 */ js.UndefOr[js.Any], 
    /* result3 */ js.UndefOr[js.Any], 
    /* result4 */ js.UndefOr[js.Any], 
    Unit
  ]
  type CommandFunction = js.Function2[/* args */ js.Array[String], /* callback */ CommandCallback, Unit]
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
}
