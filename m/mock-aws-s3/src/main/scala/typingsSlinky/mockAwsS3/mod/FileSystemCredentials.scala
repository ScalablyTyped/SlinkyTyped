package typingsSlinky.mockAwsS3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "FileSystemCredentials")
@js.native
class FileSystemCredentials protected ()
  extends typingsSlinky.awsSdk.mod.FileSystemCredentials {
  /**
    * Creates a new FileSystemCredentials object from a filename.
    * @param {string} filename - The path on disk to the JSON file to load.
    */
  def this(filename: String) = this()
}
