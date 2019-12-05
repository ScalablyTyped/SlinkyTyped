package typingsSlinky.s3rver.s3rverMod

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3rver extends js.Object {
  def run(): js.Promise[String] = js.native
  def run(
    callback: js.Function4[
      /* error */ js.Error, 
      /* hostname */ String, 
      /* port */ Double, 
      /* directory */ String, 
      Unit
    ]
  ): Server = js.native
  def setDirectory(directory: String): S3rver = js.native
  def setErrorDocument(errorDocument: String): S3rver = js.native
  def setHostname(hostname: String): S3rver = js.native
  def setIndexDocument(indexDocument: String): S3rver = js.native
  def setPort(port: Double): S3rver = js.native
  def setSilent(silent: Boolean): S3rver = js.native
}

