package typingsSlinky.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
  
  @js.native
  sealed trait CALL extends ActionTypes
  /* "@@mongorito/CALL" */ val CALL: typingsSlinky.mongorito.mod.ActionTypes.CALL with String = js.native
  
  @js.native
  sealed trait CREATE extends ActionTypes
  /* "@@mongorito/CREATE" */ val CREATE: typingsSlinky.mongorito.mod.ActionTypes.CREATE with String = js.native
  
  @js.native
  sealed trait CREATED extends ActionTypes
  /* "@@mongorito/CREATED" */ val CREATED: typingsSlinky.mongorito.mod.ActionTypes.CREATED with String = js.native
  
  @js.native
  sealed trait CREATE_INDEX extends ActionTypes
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: typingsSlinky.mongorito.mod.ActionTypes.CREATE_INDEX with String = js.native
  
  @js.native
  sealed trait DROP_INDEX extends ActionTypes
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: typingsSlinky.mongorito.mod.ActionTypes.DROP_INDEX with String = js.native
  
  @js.native
  sealed trait GET extends ActionTypes
  /* "@@mongorito/GET" */ val GET: typingsSlinky.mongorito.mod.ActionTypes.GET with String = js.native
  
  @js.native
  sealed trait INCREMENT extends ActionTypes
  /* "@@mongorito/INCREMENT" */ val INCREMENT: typingsSlinky.mongorito.mod.ActionTypes.INCREMENT with String = js.native
  
  @js.native
  sealed trait LIST_INDEXES extends ActionTypes
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: typingsSlinky.mongorito.mod.ActionTypes.LIST_INDEXES with String = js.native
  
  @js.native
  sealed trait QUERY extends ActionTypes
  /* "@@mongorito/QUERY" */ val QUERY: typingsSlinky.mongorito.mod.ActionTypes.QUERY with String = js.native
  
  @js.native
  sealed trait REFRESH extends ActionTypes
  /* "@@mongorito/REFRESH" */ val REFRESH: typingsSlinky.mongorito.mod.ActionTypes.REFRESH with String = js.native
  
  @js.native
  sealed trait REFRESHED extends ActionTypes
  /* "@@mongorito/REFRESHED" */ val REFRESHED: typingsSlinky.mongorito.mod.ActionTypes.REFRESHED with String = js.native
  
  @js.native
  sealed trait REMOVE extends ActionTypes
  /* "@@mongorito/REMOVE" */ val REMOVE: typingsSlinky.mongorito.mod.ActionTypes.REMOVE with String = js.native
  
  @js.native
  sealed trait REMOVED extends ActionTypes
  /* "@@mongorito/REMOVED" */ val REMOVED: typingsSlinky.mongorito.mod.ActionTypes.REMOVED with String = js.native
  
  @js.native
  sealed trait SAVE extends ActionTypes
  /* "@@mongorito/SAVE" */ val SAVE: typingsSlinky.mongorito.mod.ActionTypes.SAVE with String = js.native
  
  @js.native
  sealed trait SET extends ActionTypes
  /* "@@mongorito/SET" */ val SET: typingsSlinky.mongorito.mod.ActionTypes.SET with String = js.native
  
  @js.native
  sealed trait UNSET extends ActionTypes
  /* "@@mongorito/UNSET" */ val UNSET: typingsSlinky.mongorito.mod.ActionTypes.UNSET with String = js.native
  
  @js.native
  sealed trait UPDATE extends ActionTypes
  /* "@@mongorito/UPDATE" */ val UPDATE: typingsSlinky.mongorito.mod.ActionTypes.UPDATE with String = js.native
  
  @js.native
  sealed trait UPDATED extends ActionTypes
  /* "@@mongorito/UPDATED" */ val UPDATED: typingsSlinky.mongorito.mod.ActionTypes.UPDATED with String = js.native
}
