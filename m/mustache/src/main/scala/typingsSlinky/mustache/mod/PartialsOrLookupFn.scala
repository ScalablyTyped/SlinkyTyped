package typingsSlinky.mustache.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
  *
  * -- or --
  *
  * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, java.lang.String]
  - typingsSlinky.mustache.mod.PartialLookupFn
*/
trait PartialsOrLookupFn extends js.Object

object PartialsOrLookupFn {
  @scala.inline
  implicit def apply(value: PartialLookupFn): PartialsOrLookupFn = value.asInstanceOf[PartialsOrLookupFn]
  @scala.inline
  implicit def apply(value: Record[String, String]): PartialsOrLookupFn = value.asInstanceOf[PartialsOrLookupFn]
}

