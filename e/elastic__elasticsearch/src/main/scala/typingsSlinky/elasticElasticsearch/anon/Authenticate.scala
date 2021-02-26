package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityAuthenticate
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityChangePassword
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityClearApiKeyCache
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityClearCachedPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityClearCachedRealms
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityClearCachedRoles
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityCreateApiKey
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityDeletePrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityDeleteRole
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityDeleteRoleMapping
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityDeleteUser
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityDisableUser
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityEnableUser
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetApiKey
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetBuiltinPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetRole
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetRoleMapping
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetToken
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetUser
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGetUserPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityGrantApiKey
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityHasPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityInvalidateApiKey
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityInvalidateToken
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutRole
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutRoleMapping
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutUser
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authenticate extends StObject {
  
  def authenticate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](params: SecurityAuthenticate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](params: SecurityAuthenticate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clearApiKeyCache[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearApiKeyCache[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearApiKeyCache[TResponse, TContext](params: SecurityClearApiKeyCache): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearApiKeyCache[TResponse, TContext](params: SecurityClearApiKeyCache, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clearCachedPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedPrivileges[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedPrivileges[TResponse, TContext](params: SecurityClearCachedPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedPrivileges[TResponse, TContext](params: SecurityClearCachedPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clearCachedRealms[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](params: SecurityClearCachedRealms): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](params: SecurityClearCachedRealms, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clearCachedRoles[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](params: SecurityClearCachedRoles): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](params: SecurityClearCachedRoles, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deletePrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](params: SecurityDeletePrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](params: SecurityDeletePrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteRole[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](params: SecurityDeleteRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](params: SecurityDeleteRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteRoleMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](params: SecurityDeleteRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](params: SecurityDeleteRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](params: SecurityDeleteUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](params: SecurityDeleteUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def disableUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](params: SecurityDisableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](params: SecurityDisableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def enableUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](params: SecurityEnableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](params: SecurityEnableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getApiKey[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](params: SecurityGetApiKey): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](params: SecurityGetApiKey, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getBuiltinPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](params: SecurityGetPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](params: SecurityGetPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRole[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](params: SecurityGetRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](params: SecurityGetRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRoleMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](params: SecurityGetRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](params: SecurityGetRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](params: SecurityGetUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](params: SecurityGetUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getUserPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](params: SecurityGetUserPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](params: SecurityGetUserPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def grantApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def grantApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def grantApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGrantApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def grantApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGrantApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
