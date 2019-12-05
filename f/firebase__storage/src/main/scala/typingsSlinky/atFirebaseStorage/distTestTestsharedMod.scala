package typingsSlinky.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseStorage.atFirebaseStorageStrings.`totally-legit-auth-token`
import typingsSlinky.atFirebaseStorage.atFirebaseStorageStrings.mybucket
import typingsSlinky.atFirebaseStorage.distSrcImplementationErrorMod.Code
import typingsSlinky.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.Headers
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhriopoolMod.XhrIoPool
import typingsSlinky.atFirebaseStorage.distTestXhrioMod.SendHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/test/testshared", JSImport.Namespace)
@js.native
object distTestTestsharedMod extends js.Object {
  val authToken: `totally-legit-auth-token` = js.native
  val bucket: mybucket = js.native
  val fakeApp: FirebaseApp = js.native
  val fakeAppNoAuth: FirebaseApp = js.native
  def assertObjectIncludes(included: StringDictionary[js.Any], obj: StringDictionary[js.Any]): Unit = js.native
  def assertThrows(f: js.Function0[Unit], code: Code): FirebaseStorageError = js.native
  def assertUint8ArrayEquals(arr1: scala.scalajs.js.typedarray.Uint8Array, arr2: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def bind(f: js.Function, ctx: js.Any, args: js.Any*): js.Function0[Unit] = js.native
  def fakeXhrIo(headers: Headers): XhrIo = js.native
  def fakeXhrIo(headers: Headers, status: Double): XhrIo = js.native
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(token: js.Object): FirebaseApp = js.native
  def makeFakeApp(token: js.Object, bucketArg: String): FirebaseApp = js.native
  def makeFakeApp(token: Null, bucketArg: String): FirebaseApp = js.native
  def makePool(): XhrIoPool = js.native
  def makePool(sendHook: SendHook): XhrIoPool = js.native
}

