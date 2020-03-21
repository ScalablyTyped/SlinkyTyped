package typingsSlinky.acl.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  def addRoleParents(role: String, parents: Values): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addRoleParents(role: String, parents: Values, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allow(aclSets: AclSet): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typingsSlinky.bluebird.mod.^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typingsSlinky.bluebird.mod.^[_] = js.native
  def hasRole(userId: Value, role: String): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ js.Error, /* isInRole */ Boolean, _]): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typingsSlinky.bluebird.mod.^[Boolean] = js.native
  def middleware(): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def permittedResources(roles: strings, permissions: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeResource(resource: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeResource(resource: String, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeRole(role: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeRole(role: String, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def roleUsers(role: Value): typingsSlinky.bluebird.mod.^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ js.Error, /* users */ Values, _]): typingsSlinky.bluebird.mod.^[_] = js.native
  def userRoles(userId: Value): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[String], _]): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def whatResources(roles: strings): typingsSlinky.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): typingsSlinky.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings): typingsSlinky.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typingsSlinky.bluebird.mod.^[_] = js.native
}

