package typingsSlinky.builderUtilRuntime.publishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.GithubOptions
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.S3Options
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.SpacesOptions
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.GenericServerOptions
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.BintrayOptions
  - typingsSlinky.builderUtilRuntime.publishOptionsMod.CustomPublishOptions
*/
trait AllPublishOptions extends Publish

object AllPublishOptions {
  @scala.inline
  implicit def apply(value: BintrayOptions): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: CustomPublishOptions): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: GenericServerOptions): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: GithubOptions): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: S3Options): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: SpacesOptions): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
  @scala.inline
  implicit def apply(value: String): AllPublishOptions = value.asInstanceOf[AllPublishOptions]
}

