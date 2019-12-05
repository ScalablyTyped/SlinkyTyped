package typingsSlinky.mongorito.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionTypes extends js.Object

@JSImport("mongorito", "ActionTypes")
@js.native
object ActionTypes extends js.Object {
  @js.native
  sealed trait CALL extends ActionTypes
  
  @js.native
  sealed trait CREATE extends ActionTypes
  
  @js.native
  sealed trait CREATED extends ActionTypes
  
  @js.native
  sealed trait CREATE_INDEX extends ActionTypes
  
  @js.native
  sealed trait DROP_INDEX extends ActionTypes
  
  @js.native
  sealed trait GET extends ActionTypes
  
  @js.native
  sealed trait INCREMENT extends ActionTypes
  
  @js.native
  sealed trait LIST_INDEXES extends ActionTypes
  
  @js.native
  sealed trait QUERY extends ActionTypes
  
  @js.native
  sealed trait REFRESH extends ActionTypes
  
  @js.native
  sealed trait REFRESHED extends ActionTypes
  
  @js.native
  sealed trait REMOVE extends ActionTypes
  
  @js.native
  sealed trait REMOVED extends ActionTypes
  
  @js.native
  sealed trait SAVE extends ActionTypes
  
  @js.native
  sealed trait SET extends ActionTypes
  
  @js.native
  sealed trait UNSET extends ActionTypes
  
  @js.native
  sealed trait UPDATE extends ActionTypes
  
  @js.native
  sealed trait UPDATED extends ActionTypes
  
  /* "@@mongorito/CALL" */ val CALL: typingsSlinky.mongorito.mongoritoMod.ActionTypes.CALL with String = js.native
  /* "@@mongorito/CREATE" */ val CREATE: typingsSlinky.mongorito.mongoritoMod.ActionTypes.CREATE with String = js.native
  /* "@@mongorito/CREATED" */ val CREATED: typingsSlinky.mongorito.mongoritoMod.ActionTypes.CREATED with String = js.native
  /* "@@mongorito/CREATE_INDEX" */ val CREATE_INDEX: typingsSlinky.mongorito.mongoritoMod.ActionTypes.CREATE_INDEX with String = js.native
  /* "@@mongorito/DROP_INDEX" */ val DROP_INDEX: typingsSlinky.mongorito.mongoritoMod.ActionTypes.DROP_INDEX with String = js.native
  /* "@@mongorito/GET" */ val GET: typingsSlinky.mongorito.mongoritoMod.ActionTypes.GET with String = js.native
  /* "@@mongorito/INCREMENT" */ val INCREMENT: typingsSlinky.mongorito.mongoritoMod.ActionTypes.INCREMENT with String = js.native
  /* "@@mongorito/LIST_INDEXES" */ val LIST_INDEXES: typingsSlinky.mongorito.mongoritoMod.ActionTypes.LIST_INDEXES with String = js.native
  /* "@@mongorito/QUERY" */ val QUERY: typingsSlinky.mongorito.mongoritoMod.ActionTypes.QUERY with String = js.native
  /* "@@mongorito/REFRESH" */ val REFRESH: typingsSlinky.mongorito.mongoritoMod.ActionTypes.REFRESH with String = js.native
  /* "@@mongorito/REFRESHED" */ val REFRESHED: typingsSlinky.mongorito.mongoritoMod.ActionTypes.REFRESHED with String = js.native
  /* "@@mongorito/REMOVE" */ val REMOVE: typingsSlinky.mongorito.mongoritoMod.ActionTypes.REMOVE with String = js.native
  /* "@@mongorito/REMOVED" */ val REMOVED: typingsSlinky.mongorito.mongoritoMod.ActionTypes.REMOVED with String = js.native
  /* "@@mongorito/SAVE" */ val SAVE: typingsSlinky.mongorito.mongoritoMod.ActionTypes.SAVE with String = js.native
  /* "@@mongorito/SET" */ val SET: typingsSlinky.mongorito.mongoritoMod.ActionTypes.SET with String = js.native
  /* "@@mongorito/UNSET" */ val UNSET: typingsSlinky.mongorito.mongoritoMod.ActionTypes.UNSET with String = js.native
  /* "@@mongorito/UPDATE" */ val UPDATE: typingsSlinky.mongorito.mongoritoMod.ActionTypes.UPDATE with String = js.native
  /* "@@mongorito/UPDATED" */ val UPDATED: typingsSlinky.mongorito.mongoritoMod.ActionTypes.UPDATED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionTypes with String] = js.native
}

