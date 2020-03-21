package typingsSlinky.parcelBundler.mod

import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.Server
import typingsSlinky.parcelBundler.parcelBundlerBooleans.`false`
import typingsSlinky.parcelBundler.parcelBundlerBooleans.`true`
import typingsSlinky.parcelBundler.parcelBundlerStrings.buildEnd
import typingsSlinky.parcelBundler.parcelBundlerStrings.buildError
import typingsSlinky.parcelBundler.parcelBundlerStrings.buildStart
import typingsSlinky.parcelBundler.parcelBundlerStrings.bundled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelBundler extends js.Object {
  def addAssetType(extension: String, path: String): Unit = js.native
  def addPackager(`type`: String, packager: String): Unit = js.native
  def bundle(): js.Promise[ParcelBundle] = js.native
  def middleware(): js.Function3[
    /* req */ Request[ParamsDictionary, _, _], 
    /* res */ Response[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  @JSName("off")
  def off_buildEnd(name: buildEnd, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildError(name: buildError, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildStart(name: buildStart, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_bundled(name: bundled, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_buildEnd(name: buildEnd, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_buildError(name: buildError, cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  @JSName("on")
  def on_buildStart(name: buildStart, cb: js.Function1[/* entryPoints */ js.Array[String], Unit]): Unit = js.native
  @JSName("on")
  def on_bundled(name: bundled, cb: js.Function1[/* bundle */ ParcelBundle, Unit]): Unit = js.native
  def serve(): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  def serve(port: Double): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions, host: String): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`, host: String): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`, host: String): js.Promise[Server | typingsSlinky.node.httpsMod.Server] = js.native
}

