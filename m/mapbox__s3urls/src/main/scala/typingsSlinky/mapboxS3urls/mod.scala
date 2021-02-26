package typingsSlinky.mapboxS3urls

import typingsSlinky.mapboxS3urls.anon.Bucket
import typingsSlinky.mapboxS3urls.anon.Bucketinhost
import typingsSlinky.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-host`
import typingsSlinky.mapboxS3urls.mapboxS3urlsStrings.`bucket-in-path`
import typingsSlinky.mapboxS3urls.mapboxS3urlsStrings.s3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/s3urls", "convert")
  @js.native
  def convert_bucketinhost(url: String, to: `bucket-in-host`): String = js.native
  @JSImport("@mapbox/s3urls", "convert")
  @js.native
  def convert_bucketinpath(url: String, to: `bucket-in-path`): String = js.native
  @JSImport("@mapbox/s3urls", "convert")
  @js.native
  def convert_s3(url: String, to: s3): String = js.native
  
  @JSImport("@mapbox/s3urls", "fromUrl")
  @js.native
  def fromUrl(url: String): Bucket = js.native
  
  @JSImport("@mapbox/s3urls", "signed")
  @js.native
  def signed(
    url: String,
    expires: Double,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* url */ String, Unit]
  ): Unit = js.native
  
  @JSImport("@mapbox/s3urls", "toUrl")
  @js.native
  def toUrl(bucket: String, key: String): Bucketinhost = js.native
  
  @JSImport("@mapbox/s3urls", "valid")
  @js.native
  def valid(url: String): Boolean = js.native
}
