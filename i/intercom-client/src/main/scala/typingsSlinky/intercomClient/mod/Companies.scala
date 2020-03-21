package typingsSlinky.intercomClient.mod

import typingsSlinky.intercomClient.AnonSegmentid
import typingsSlinky.intercomClient.PartialCompany
import typingsSlinky.intercomClient.companyMod.Company
import typingsSlinky.intercomClient.companyMod.CompanyIdentifier
import typingsSlinky.intercomClient.companyMod.List
import typingsSlinky.intercomClient.scrollMod.Scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Companies")
@js.native
class Companies () extends js.Object {
  var scroll: Scroll[Company] = js.native
  def archive(): js.Promise[Company] = js.native
  def create(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def create(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
  def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
  def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
  def list(): js.Promise[ApiResponse[List]] = js.native
  def list(cb: callback[ApiResponse[List]]): Unit = js.native
  def listBy(params: AnonSegmentid): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: AnonSegmentid, cb: callback[ApiResponse[List]]): Unit = js.native
  def update(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
  def update(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
}

