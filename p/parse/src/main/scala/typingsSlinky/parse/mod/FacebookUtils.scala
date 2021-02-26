package typingsSlinky.parse.mod

import typingsSlinky.parse.mod.global.Parse.Attributes
import typingsSlinky.parse.mod.global.Parse.FullOptions
import typingsSlinky.parse.mod.global.Parse.SuccessFailureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
object FacebookUtils {
  
  @JSImport("parse", "FacebookUtils.init")
  @js.native
  def init(): Unit = js.native
  @JSImport("parse", "FacebookUtils.init")
  @js.native
  def init(options: js.Any): Unit = js.native
  
  @JSImport("parse", "FacebookUtils.isLinked")
  @js.native
  def isLinked(user: typingsSlinky.parse.mod.global.Parse.User[Attributes]): Boolean = js.native
  
  @JSImport("parse", "FacebookUtils.link")
  @js.native
  def link(user: typingsSlinky.parse.mod.global.Parse.User[Attributes], permissions: js.Any): Unit = js.native
  @JSImport("parse", "FacebookUtils.link")
  @js.native
  def link(
    user: typingsSlinky.parse.mod.global.Parse.User[Attributes],
    permissions: js.Any,
    options: SuccessFailureOptions
  ): Unit = js.native
  
  @JSImport("parse", "FacebookUtils.logIn")
  @js.native
  def logIn(permissions: js.Any): Unit = js.native
  @JSImport("parse", "FacebookUtils.logIn")
  @js.native
  def logIn(permissions: js.Any, options: FullOptions): Unit = js.native
  
  @JSImport("parse", "FacebookUtils.unlink")
  @js.native
  def unlink(user: typingsSlinky.parse.mod.global.Parse.User[Attributes]): Unit = js.native
  @JSImport("parse", "FacebookUtils.unlink")
  @js.native
  def unlink(user: typingsSlinky.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = js.native
}
