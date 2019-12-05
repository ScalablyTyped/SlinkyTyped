package typingsSlinky.jestDashSnapshot

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.atJestTypes.buildConfigMod.SnapshotUpdateState
import typingsSlinky.expect.expectMod.MatcherState
import typingsSlinky.jestDashSnapshot.buildStateMod.SnapshotStateOptions
import typingsSlinky.jestDashSnapshot.buildStateMod.default
import typingsSlinky.jestDashSnapshot.jestDashSnapshotMod.Context
import typingsSlinky.prettyDashFormat.buildTypesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object jestDashSnapshotMod extends js.Object {
  @js.native
  class SnapshotState protected () extends default {
    def this(snapshotPath: Path, options: SnapshotStateOptions) = this()
  }
  
  var EXTENSION: String = js.native
  var SnapshotState: Instantiable2[/* snapshotPath */ Path, /* options */ SnapshotStateOptions, default] = js.native
  var utils: Typeofutils = js.native
  def addSerializer(plugin: Plugin): Unit = js.native
  def buildSnapshotResolver(config: ProjectConfig): typingsSlinky.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver = js.native
  def cleanup(
    hasteFS: typingsSlinky.jestDashHasteDashMap.buildHasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typingsSlinky.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver
  ): Anon_FilesRemoved = js.native
  def cleanup(
    hasteFS: typingsSlinky.jestDashHasteDashMap.buildHasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typingsSlinky.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): Anon_FilesRemoved = js.native
  def getSerializers(): js.Array[Plugin] = js.native
  def isSnapshotPath(path: String): Boolean = js.native
  def toMatchInlineSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(`this`: Context, received: js.Any, propertyMatchersOrInlineSnapshot: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(
    `this`: Context,
    received: js.Any,
    propertyMatchersOrInlineSnapshot: js.Any,
    inlineSnapshot: String
  ): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any, propertyMatchers: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any, propertyMatchers: js.Any, hint: String): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: String): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: String, fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(`this`: Context, received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(`this`: Context, received: js.Any, hint: String, fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  type Context = MatcherState with Anon_SnapshotState
  type SnapshotResolver = typingsSlinky.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver
  type SnapshotStateType = default
}

