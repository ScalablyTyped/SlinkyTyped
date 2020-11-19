package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Goal
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Goals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalsCollection extends js.Object {
  
  // Gets a goal to which the user has access.
  def get(accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
  
  // Create a new goal.
  def insert(resource: Goal, accountId: String, webPropertyId: String, profileId: String): Goal = js.native
  
  // Lists goals to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String): Goals = js.native
  // Lists goals to which the user has access.
  def list(accountId: String, webPropertyId: String, profileId: String, optionalArgs: js.Object): Goals = js.native
  
  // Updates an existing goal. This method supports patch semantics.
  def patch(resource: Goal, accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
  
  // Updates an existing goal.
  def update(resource: Goal, accountId: String, webPropertyId: String, profileId: String, goalId: String): Goal = js.native
}
