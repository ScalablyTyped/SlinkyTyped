package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.ionicStrings.GET
  - typingsSlinky.ionic.ionicStrings.POST
  - typingsSlinky.ionic.ionicStrings.PATCH
  - typingsSlinky.ionic.ionicStrings.PUT
  - typingsSlinky.ionic.ionicStrings.DELETE
  - typingsSlinky.ionic.ionicStrings.PURGE
  - typingsSlinky.ionic.ionicStrings.HEAD
  - typingsSlinky.ionic.ionicStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.ionic.ionicStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.ionic.ionicStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.ionic.ionicStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsSlinky.ionic.ionicStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.ionic.ionicStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.ionic.ionicStrings.POST = this.cast("POST")
  @scala.inline
  def PURGE: typingsSlinky.ionic.ionicStrings.PURGE = this.cast("PURGE")
  @scala.inline
  def PUT: typingsSlinky.ionic.ionicStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

