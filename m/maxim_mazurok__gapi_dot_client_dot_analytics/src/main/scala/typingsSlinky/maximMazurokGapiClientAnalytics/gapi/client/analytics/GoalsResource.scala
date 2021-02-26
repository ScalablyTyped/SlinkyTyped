package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.FieldsGoalId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.GoalId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.KeyMaxresults
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalsResource extends StObject {
  
  /** Gets a goal to which the user has access. */
  def get(): Request[Goal] = js.native
  def get(request: GoalId): Request[Goal] = js.native
  
  def insert(request: FieldsKey, body: Goal): Request[Goal] = js.native
  /** Create a new goal. */
  def insert(request: OauthtokenPrettyPrint): Request[Goal] = js.native
  
  /** Lists goals to which the user has access. */
  def list(): Request[Goals] = js.native
  def list(request: KeyMaxresults): Request[Goals] = js.native
  
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: FieldsGoalId): Request[Goal] = js.native
  def patch(request: GoalId, body: Goal): Request[Goal] = js.native
  
  /** Updates an existing goal. */
  def update(request: FieldsGoalId): Request[Goal] = js.native
  def update(request: GoalId, body: Goal): Request[Goal] = js.native
}
