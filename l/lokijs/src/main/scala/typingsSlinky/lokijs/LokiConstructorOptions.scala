package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.BROWSER
import typingsSlinky.lokijs.lokijsStrings.CORDOVA
import typingsSlinky.lokijs.lokijsStrings.NA
import typingsSlinky.lokijs.lokijsStrings.NATIVESCRIPT
import typingsSlinky.lokijs.lokijsStrings.NODEJS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiConstructorOptions extends js.Object {
  var env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA
  var verbose: Boolean
}

object LokiConstructorOptions {
  @scala.inline
  def apply(env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA, verbose: Boolean): LokiConstructorOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiConstructorOptions]
  }
}

