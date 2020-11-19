package typingsSlinky.ltijs.gradeServiceMod

import typingsSlinky.ltijs.idTokenMod.IdToken
import typingsSlinky.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradeService extends js.Object {
  
  def result(idtoken: IdToken): js.Promise[js.Array[RetrievedGrade] | `false`] = js.native
  def result(idtoken: IdToken, filters: GradeFilters): js.Promise[js.Array[RetrievedGrade] | `false`] = js.native
  
  def scorePublish(idtoken: IdToken, grade: PublishedGrade): js.Promise[Boolean] = js.native
}
