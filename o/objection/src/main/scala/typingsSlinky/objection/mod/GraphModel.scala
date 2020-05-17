package typingsSlinky.objection.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.objection.anon.DbRef
import typingsSlinky.objection.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objection.anon.Id with T
  - typingsSlinky.objection.anon.Ref with typingsSlinky.objection.objectionStrings.GraphModel with org.scalablytyped.runtime.TopLevel[js.Any]
  - typingsSlinky.objection.anon.DbRef with typingsSlinky.objection.objectionStrings.GraphModel with org.scalablytyped.runtime.TopLevel[js.Any]
*/
trait GraphModel[T]
  extends DeepPartialGraphModel[js.Any]

object GraphModel {
  @scala.inline
  implicit def apply[T](value: typingsSlinky.objection.anon.Id with T): GraphModel[T] = value.asInstanceOf[GraphModel[T]]
  @scala.inline
  implicit def apply[T](value: Ref with typingsSlinky.objection.objectionStrings.GraphModel with TopLevel[js.Any]): GraphModel[T] = value.asInstanceOf[GraphModel[T]]
  @scala.inline
  implicit def apply[T](value: DbRef with typingsSlinky.objection.objectionStrings.GraphModel with TopLevel[js.Any]): GraphModel[T] = value.asInstanceOf[GraphModel[T]]
}

