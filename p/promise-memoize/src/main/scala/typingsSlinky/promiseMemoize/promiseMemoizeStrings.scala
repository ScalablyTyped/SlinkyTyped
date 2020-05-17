package typingsSlinky.promiseMemoize

import typingsSlinky.promiseMemoize.mod.KeyResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promiseMemoizeStrings {
  @js.native
  sealed trait json extends KeyResolver
  
  @js.native
  sealed trait simple extends KeyResolver
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
}

