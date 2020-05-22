package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityAuthenticate
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityChangePassword
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
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityHasPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityInvalidateApiKey
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityInvalidateToken
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutPrivileges
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutRole
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutRoleMapping
import typingsSlinky.elasticElasticsearch.requestParamsMod.SecurityPutUser
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticate extends js.Object {
  def authenticate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def authenticate[TResponse, TContext](params: SecurityAuthenticate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](params: SecurityAuthenticate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def authenticate[TResponse, TContext](params: SecurityAuthenticate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def authenticate[TResponse, TContext](
    params: SecurityAuthenticate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def changePassword[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityChangePassword[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityChangePassword[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def change_password[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityChangePassword[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clearCachedRealms[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCachedRealms[TResponse, TContext](params: SecurityClearCachedRealms): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](params: SecurityClearCachedRealms, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCachedRealms[TResponse, TContext](params: SecurityClearCachedRealms, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRealms[TResponse, TContext](
    params: SecurityClearCachedRealms,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clearCachedRoles[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCachedRoles[TResponse, TContext](params: SecurityClearCachedRoles): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](params: SecurityClearCachedRoles, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCachedRoles[TResponse, TContext](params: SecurityClearCachedRoles, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCachedRoles[TResponse, TContext](
    params: SecurityClearCachedRoles,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clear_cached_realms[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_realms[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cached_realms[TResponse, TContext](params: SecurityClearCachedRealms): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_realms[TResponse, TContext](params: SecurityClearCachedRealms, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cached_realms[TResponse, TContext](params: SecurityClearCachedRealms, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_realms[TResponse, TContext](
    params: SecurityClearCachedRealms,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clear_cached_roles[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_roles[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cached_roles[TResponse, TContext](params: SecurityClearCachedRoles): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_roles[TResponse, TContext](params: SecurityClearCachedRoles, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cached_roles[TResponse, TContext](params: SecurityClearCachedRoles, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cached_roles[TResponse, TContext](
    params: SecurityClearCachedRoles,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityCreateApiKey[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityCreateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityCreateApiKey[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deletePrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePrivileges[TResponse, TContext](params: SecurityDeletePrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](params: SecurityDeletePrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePrivileges[TResponse, TContext](params: SecurityDeletePrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePrivileges[TResponse, TContext](
    params: SecurityDeletePrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteRole[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRole[TResponse, TContext](params: SecurityDeleteRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](params: SecurityDeleteRole, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRole[TResponse, TContext](params: SecurityDeleteRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRole[TResponse, TContext](
    params: SecurityDeleteRole,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteRoleMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRoleMapping[TResponse, TContext](params: SecurityDeleteRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](params: SecurityDeleteRoleMapping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRoleMapping[TResponse, TContext](params: SecurityDeleteRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRoleMapping[TResponse, TContext](
    params: SecurityDeleteRoleMapping,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteUser[TResponse, TContext](params: SecurityDeleteUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](params: SecurityDeleteUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteUser[TResponse, TContext](params: SecurityDeleteUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteUser[TResponse, TContext](
    params: SecurityDeleteUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_privileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_privileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_privileges[TResponse, TContext](params: SecurityDeletePrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_privileges[TResponse, TContext](params: SecurityDeletePrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_privileges[TResponse, TContext](params: SecurityDeletePrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_privileges[TResponse, TContext](
    params: SecurityDeletePrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_role[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_role[TResponse, TContext](params: SecurityDeleteRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role[TResponse, TContext](params: SecurityDeleteRole, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_role[TResponse, TContext](params: SecurityDeleteRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role[TResponse, TContext](
    params: SecurityDeleteRole,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_role_mapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role_mapping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_role_mapping[TResponse, TContext](params: SecurityDeleteRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role_mapping[TResponse, TContext](params: SecurityDeleteRoleMapping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_role_mapping[TResponse, TContext](params: SecurityDeleteRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_role_mapping[TResponse, TContext](
    params: SecurityDeleteRoleMapping,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_user[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_user[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_user[TResponse, TContext](params: SecurityDeleteUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_user[TResponse, TContext](params: SecurityDeleteUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_user[TResponse, TContext](params: SecurityDeleteUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_user[TResponse, TContext](
    params: SecurityDeleteUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def disableUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def disableUser[TResponse, TContext](params: SecurityDisableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](params: SecurityDisableUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def disableUser[TResponse, TContext](params: SecurityDisableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disableUser[TResponse, TContext](
    params: SecurityDisableUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def disable_user[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disable_user[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def disable_user[TResponse, TContext](params: SecurityDisableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disable_user[TResponse, TContext](params: SecurityDisableUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def disable_user[TResponse, TContext](params: SecurityDisableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def disable_user[TResponse, TContext](
    params: SecurityDisableUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def enableUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def enableUser[TResponse, TContext](params: SecurityEnableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](params: SecurityEnableUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def enableUser[TResponse, TContext](params: SecurityEnableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enableUser[TResponse, TContext](
    params: SecurityEnableUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def enable_user[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enable_user[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def enable_user[TResponse, TContext](params: SecurityEnableUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enable_user[TResponse, TContext](params: SecurityEnableUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def enable_user[TResponse, TContext](params: SecurityEnableUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def enable_user[TResponse, TContext](
    params: SecurityEnableUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getApiKey[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getApiKey[TResponse, TContext](params: SecurityGetApiKey): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](params: SecurityGetApiKey, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getApiKey[TResponse, TContext](params: SecurityGetApiKey, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getApiKey[TResponse, TContext](
    params: SecurityGetApiKey,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getBuiltinPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBuiltinPrivileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBuiltinPrivileges[TResponse, TContext](
    params: SecurityGetBuiltinPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPrivileges[TResponse, TContext](params: SecurityGetPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](params: SecurityGetPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPrivileges[TResponse, TContext](params: SecurityGetPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPrivileges[TResponse, TContext](
    params: SecurityGetPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getRole[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRole[TResponse, TContext](params: SecurityGetRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](params: SecurityGetRole, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRole[TResponse, TContext](params: SecurityGetRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRole[TResponse, TContext](
    params: SecurityGetRole,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getRoleMapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRoleMapping[TResponse, TContext](params: SecurityGetRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](params: SecurityGetRoleMapping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRoleMapping[TResponse, TContext](params: SecurityGetRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRoleMapping[TResponse, TContext](
    params: SecurityGetRoleMapping,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityGetToken[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getUser[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getUser[TResponse, TContext](params: SecurityGetUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](params: SecurityGetUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getUser[TResponse, TContext](params: SecurityGetUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUser[TResponse, TContext](
    params: SecurityGetUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getUserPrivileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getUserPrivileges[TResponse, TContext](params: SecurityGetUserPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](params: SecurityGetUserPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getUserPrivileges[TResponse, TContext](params: SecurityGetUserPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getUserPrivileges[TResponse, TContext](
    params: SecurityGetUserPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_api_key[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_api_key[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_api_key[TResponse, TContext](params: SecurityGetApiKey): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_api_key[TResponse, TContext](params: SecurityGetApiKey, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_api_key[TResponse, TContext](params: SecurityGetApiKey, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_api_key[TResponse, TContext](
    params: SecurityGetApiKey,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_builtin_privileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_builtin_privileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_builtin_privileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_builtin_privileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_builtin_privileges[TResponse, TContext](params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_builtin_privileges[TResponse, TContext](
    params: SecurityGetBuiltinPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_privileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_privileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_privileges[TResponse, TContext](params: SecurityGetPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_privileges[TResponse, TContext](params: SecurityGetPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_privileges[TResponse, TContext](params: SecurityGetPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_privileges[TResponse, TContext](
    params: SecurityGetPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_role[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_role[TResponse, TContext](params: SecurityGetRole): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role[TResponse, TContext](params: SecurityGetRole, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_role[TResponse, TContext](params: SecurityGetRole, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role[TResponse, TContext](
    params: SecurityGetRole,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_role_mapping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role_mapping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_role_mapping[TResponse, TContext](params: SecurityGetRoleMapping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role_mapping[TResponse, TContext](params: SecurityGetRoleMapping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_role_mapping[TResponse, TContext](params: SecurityGetRoleMapping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_role_mapping[TResponse, TContext](
    params: SecurityGetRoleMapping,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityGetToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityGetToken[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_user[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_user[TResponse, TContext](params: SecurityGetUser): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user[TResponse, TContext](params: SecurityGetUser, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_user[TResponse, TContext](params: SecurityGetUser, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user[TResponse, TContext](
    params: SecurityGetUser,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_user_privileges[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user_privileges[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_user_privileges[TResponse, TContext](params: SecurityGetUserPrivileges): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user_privileges[TResponse, TContext](params: SecurityGetUserPrivileges, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_user_privileges[TResponse, TContext](params: SecurityGetUserPrivileges, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_user_privileges[TResponse, TContext](
    params: SecurityGetUserPrivileges,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hasPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityHasPrivileges[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityHasPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def has_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityHasPrivileges[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateApiKey[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityInvalidateApiKey[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidateToken[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityInvalidateToken[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateApiKey[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_api_key[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityInvalidateApiKey[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityInvalidateToken[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def invalidate_token[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityInvalidateToken[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPrivileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutPrivileges[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRole[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutRole[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putRoleMapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutRoleMapping[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putUser[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutUser[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutPrivileges[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_privileges[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutPrivileges[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRole[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutRole[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutRoleMapping[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_role_mapping[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutRoleMapping[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SecurityPutUser[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_user[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SecurityPutUser[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

