package typingsSlinky.jestTypes.globalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.istanbulLibCoverage.mod.CoverageMapData
import typingsSlinky.jestTypes.anon.ItBaseconcurrentItConcurr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global
  extends typingsSlinky.node.NodeJS.Global
     with /* extras */ StringDictionary[js.Any] {
  
  var __coverage__ : CoverageMapData = js.native
  
  def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("describe")
  var describe_Original: Describe = js.native
  
  def fail(): Unit = js.native
  
  def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("fdescribe")
  var fdescribe_Original: DescribeBase = js.native
  
  def fit(testName: TestName, fn: TestFn): Unit = js.native
  def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("fit")
  var fit_Original: ItBaseconcurrentItConcurr = js.native
  
  def it(testName: TestName, fn: TestFn): Unit = js.native
  def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("it")
  var it_Original: ItConcurrent = js.native
  
  var jasmine: Jasmine = js.native
  
  def pending(): Unit = js.native
  
  def spyOn(): Unit = js.native
  
  def spyOnProperty(): Unit = js.native
  
  def test(testName: TestName, fn: TestFn): Unit = js.native
  def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("test")
  var test_Original: ItConcurrent = js.native
  
  def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("xdescribe")
  var xdescribe_Original: DescribeBase = js.native
  
  def xit(testName: TestName, fn: TestFn): Unit = js.native
  def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("xit")
  var xit_Original: ItBase = js.native
  
  def xtest(testName: TestName, fn: TestFn): Unit = js.native
  def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("xtest")
  var xtest_Original: ItBase = js.native
}
