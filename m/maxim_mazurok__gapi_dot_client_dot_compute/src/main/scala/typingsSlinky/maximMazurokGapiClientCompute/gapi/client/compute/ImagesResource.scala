package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsImage
import typingsSlinky.maximMazurokGapiClientCompute.anon.Family
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsForceCreate
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsImage
import typingsSlinky.maximMazurokGapiClientCompute.anon.ForceCreate
import typingsSlinky.maximMazurokGapiClientCompute.anon.ImageKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenOptionsRequestedPolicyVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesResource extends StObject {
  
  /** Deletes the specified image. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Image): Request[Operation] = js.native
  
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: FieldsImage): Request[Operation] = js.native
  def deprecate(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Image, body: DeprecationStatus): Request[Operation] = js.native
  
  /** Returns the specified image. Gets a list of available images by making a list() request. */
  def get(): Request[Image] = js.native
  def get(request: ImageKey): Request[Image] = js.native
  
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(): Request[Image] = js.native
  def getFromFamily(request: Family): Request[Image] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OauthtokenOptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  def insert(request: FieldsForceCreate, body: Image): Request[Operation] = js.native
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: ForceCreate): Request[Operation] = js.native
  
  /**
    * Retrieves the list of custom images available to the specified project. Custom images are images you create that belong to your project. This method does not get any images that
    * belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of publicly-available images, use this method to make a request to the
    * respective image project, such as debian-cloud or windows-cloud.
    */
  def list(): Request[ImageList] = js.native
  def list(request: MaxResults): Request[ImageList] = js.native
  
  /** Patches the specified image with the data included in the request. Only the following fields can be modified: family, description, deprecation status. */
  def patch(request: AltFieldsImage): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Image, body: Image): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: KeyOauthtokenPrettyPrint, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtokenPrettyPrint, body: GlobalSetLabelsRequest): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: KeyOauthtokenPrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
