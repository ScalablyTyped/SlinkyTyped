package typingsSlinky.jestSnapshot

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.expect.anon.readonlyprintExpectedvalu
import typingsSlinky.expect.typesMod.Tester
import typingsSlinky.jestHasteMap.hasteFSMod.default
import typingsSlinky.jestSnapshot.anon.Expected
import typingsSlinky.jestSnapshot.anon.FilesRemoved
import typingsSlinky.jestSnapshot.anon.Message
import typingsSlinky.jestSnapshot.anon.Name
import typingsSlinky.jestSnapshot.anon.Typeofutils
import typingsSlinky.jestSnapshot.stateMod.SnapshotStateOptions
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import typingsSlinky.prettyFormat.typesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var EXTENSION: String = js.native
  
  def addSerializer(plugin: Plugin): Unit = js.native
  
  def buildSnapshotResolver(config: ProjectConfig): typingsSlinky.jestSnapshot.snapshotResolverMod.SnapshotResolver = js.native
  
  def cleanup(
    hasteFS: default,
    update: SnapshotUpdateState,
    snapshotResolver: typingsSlinky.jestSnapshot.snapshotResolverMod.SnapshotResolver
  ): FilesRemoved = js.native
  def cleanup(
    hasteFS: default,
    update: SnapshotUpdateState,
    snapshotResolver: typingsSlinky.jestSnapshot.snapshotResolverMod.SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): FilesRemoved = js.native
  
  def getSerializers(): js.Array[Plugin] = js.native
  
  def isSnapshotPath(path: String): Boolean = js.native
  
  def toMatchInlineSnapshot(received: js.Any): Expected | Message | Name = js.native
  def toMatchInlineSnapshot(
    received: js.Any,
    propertyMatchersOrInlineSnapshot: js.UndefOr[scala.Nothing],
    inlineSnapshot: String
  ): Expected | Message | Name = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any): Expected | Message | Name = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any, inlineSnapshot: String): Expected | Message | Name = js.native
  
  def toMatchSnapshot(received: js.Any): Expected | Message | Name = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.UndefOr[scala.Nothing], hint: String): Expected | Message | Name = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any): Expected | Message | Name = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any, hint: String): Expected | Message | Name = js.native
  
  def toThrowErrorMatchingInlineSnapshot(received: js.Any): Expected | Message | Name = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): Expected | Message | Name = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String): Expected | Message | Name = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String, fromPromise: Boolean): Expected | Message | Name = js.native
  
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): Expected | Message | Name = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: String, fromPromise: Boolean): Expected | Message | Name = js.native
  
  var utils: Typeofutils = js.native
  
  /* Inlined expect.expect.MatcherState & {  snapshotState :jest-snapshot.jest-snapshot/build/State.default} */
  @js.native
  trait Context extends js.Object {
    
    var assertionCalls: Double = js.native
    
    var currentTestName: js.UndefOr[String] = js.native
    
    var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
    
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], strictCheck: Boolean): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
    
    var error: js.UndefOr[js.Error] = js.native
    
    var expand: js.UndefOr[Boolean] = js.native
    
    var expectedAssertionsNumber: js.UndefOr[Double] = js.native
    
    var isExpectingAssertions: js.UndefOr[Boolean] = js.native
    
    var isNot: Boolean = js.native
    
    var promise: String = js.native
    
    var snapshotState: typingsSlinky.jestSnapshot.stateMod.default = js.native
    
    var suppressedErrors: js.Array[js.Error] = js.native
    
    var testPath: js.UndefOr[Path] = js.native
    
    var utils: readonlyprintExpectedvalu = js.native
  }
  
  @js.native
  class SnapshotState protected ()
    extends typingsSlinky.jestSnapshot.stateMod.default {
    def this(snapshotPath: Path, options: SnapshotStateOptions) = this()
  }
  @js.native
  object SnapshotState
    extends TopLevel[
          Instantiable2[
            /* snapshotPath */ Path, 
            /* options */ SnapshotStateOptions, 
            typingsSlinky.jestSnapshot.stateMod.default
          ]
        ]
  
  type SnapshotResolver = typingsSlinky.jestSnapshot.snapshotResolverMod.SnapshotResolver
  
  type SnapshotStateType = typingsSlinky.jestSnapshot.stateMod.default
}
