package typingsSlinky.node.anon

import typingsSlinky.node.nodeStrings.deepEqual
import typingsSlinky.node.nodeStrings.deepStrictEqual
import typingsSlinky.node.nodeStrings.equal
import typingsSlinky.node.nodeStrings.ifError
import typingsSlinky.node.nodeStrings.notDeepEqual
import typingsSlinky.node.nodeStrings.notEqual
import typingsSlinky.node.nodeStrings.ok
import typingsSlinky.node.nodeStrings.strict
import typingsSlinky.node.nodeStrings.strictEqual
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepEqual extends StObject {
  
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  def deepEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("deepEqual")
  var deepEqual_Original: FnCall = js.native
  
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("deepStrictEqual")
  var deepStrictEqual_Original: FnCall = js.native
  
  def equal[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def equal[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def equal[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("equal")
  var equal_Original: FnCall = js.native
  
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = js.native
  @JSName("ifError")
  var ifError_Original: js.Function1[
    /* value */ js.Any, 
    js.UndefOr[
      /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
    ]
  ] = js.native
  
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  @JSName("notDeepEqual")
  var notDeepEqual_Original: js.Function3[
    /* actual */ js.Any, 
    /* expected */ js.Any, 
    /* message */ js.UndefOr[String | js.Error], 
    Unit
  ] = js.native
  
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: js.Error): Unit = js.native
  @JSName("notEqual")
  var notEqual_Original: js.Function3[
    /* actual */ js.Any, 
    /* expected */ js.Any, 
    /* message */ js.UndefOr[String | js.Error], 
    Unit
  ] = js.native
  
  // Mapped types and assertion functions are incompatible?
  // TS2775: Assertions require every name in the call target
  // to be declared with an explicit type annotation.
  def ok(value: js.Any): /* asserts value */ Boolean = js.native
  def ok(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  def ok(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  // Mapped types and assertion functions are incompatible?
  // TS2775: Assertions require every name in the call target
  // to be declared with an explicit type annotation.
  @JSName("ok")
  var ok_Original: js.Function2[
    /* value */ js.Any, 
    /* message */ js.UndefOr[String | js.Error], 
    /* asserts value */ Boolean
  ] = js.native
  
  def strict(value: js.Any): /* asserts value */ Boolean = js.native
  def strict(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  def strict(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
  
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def strictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  def strictEqual[T](actual: js.Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSName("strictEqual")
  var strictEqual_Original: FnCall = js.native
  
  @JSName("strict")
  var strict_Original: (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) with Call = js.native
}
