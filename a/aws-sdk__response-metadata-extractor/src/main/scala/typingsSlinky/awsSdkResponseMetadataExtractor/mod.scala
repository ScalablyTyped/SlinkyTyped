package typingsSlinky.awsSdkResponseMetadataExtractor

import typingsSlinky.awsSdkTypes.httpMod.HttpResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/response-metadata-extractor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extractMetadata(httpResponse: HttpResponse[_]): ResponseMetadata = js.native
}

