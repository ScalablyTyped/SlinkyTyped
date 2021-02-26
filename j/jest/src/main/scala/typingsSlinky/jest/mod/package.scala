package typingsSlinky.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractEachCallbackArgs[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: jest.anon.1<T>[T extends std.Readonly<[any]> ? 1 : T extends std.Readonly<[any, any]> ? 2 : T extends std.Readonly<[any, any, any]> ? 3 : T extends std.Readonly<[any, any, any, any]> ? 4 : T extends std.Readonly<[any, any, any, any, any]> ? 5 : T extends std.Readonly<[any, any, any, any, any, any]> ? 6 : T extends std.Readonly<[any, any, any, any, any, any, any]> ? 7 : T extends std.Readonly<[any, any, any, any, any, any, any, any]> ? 8 : T extends std.Readonly<[any, any, any, any, any, any, any, any, any]> ? 9 : T extends std.Readonly<[any, any, any, any, any, any, any, any, any, any]> ? 10 : 'fallback'] */ js.Any
  
  @scala.inline
  def afterAll: typingsSlinky.jest.mod.jest.Lifecycle = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterAll").asInstanceOf[typingsSlinky.jest.mod.jest.Lifecycle]
  @scala.inline
  def afterAll_=(x: typingsSlinky.jest.mod.jest.Lifecycle): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def afterEach: typingsSlinky.jest.mod.jest.Lifecycle = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typingsSlinky.jest.mod.jest.Lifecycle]
  @scala.inline
  def afterEach_=(x: typingsSlinky.jest.mod.jest.Lifecycle): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def beforeAll: typingsSlinky.jest.mod.jest.Lifecycle = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeAll").asInstanceOf[typingsSlinky.jest.mod.jest.Lifecycle]
  @scala.inline
  def beforeAll_=(x: typingsSlinky.jest.mod.jest.Lifecycle): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeAll")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def beforeEach: typingsSlinky.jest.mod.jest.Lifecycle = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typingsSlinky.jest.mod.jest.Lifecycle]
  @scala.inline
  def beforeEach_=(x: typingsSlinky.jest.mod.jest.Lifecycle): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def describe: typingsSlinky.jest.mod.jest.Describe = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("describe").asInstanceOf[typingsSlinky.jest.mod.jest.Describe]
  @scala.inline
  def describe_=(x: typingsSlinky.jest.mod.jest.Describe): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def expect: typingsSlinky.jest.mod.jest.Expect = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("expect").asInstanceOf[typingsSlinky.jest.mod.jest.Expect]
  
  /**
    * Fails a test when called within one.
    */
  @scala.inline
  def fail(): scala.Nothing = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(error: js.Any): scala.Nothing = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fail")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def fdescribe: typingsSlinky.jest.mod.jest.Describe = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fdescribe").asInstanceOf[typingsSlinky.jest.mod.jest.Describe]
  @scala.inline
  def fdescribe_=(x: typingsSlinky.jest.mod.jest.Describe): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fdescribe")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def fit: typingsSlinky.jest.mod.jest.It = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fit").asInstanceOf[typingsSlinky.jest.mod.jest.It]
  @scala.inline
  def fit_=(x: typingsSlinky.jest.mod.jest.It): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fit")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def it: typingsSlinky.jest.mod.jest.It = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("it").asInstanceOf[typingsSlinky.jest.mod.jest.It]
  @scala.inline
  def it_=(x: typingsSlinky.jest.mod.jest.It): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
  
  /**
    * If you call the function pending anywhere in the spec body,
    * no matter the expectations, the spec will be marked pending.
    */
  @scala.inline
  def pending(): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pending")().asInstanceOf[scala.Unit]
  @scala.inline
  def pending(reason: java.lang.String): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pending")(reason.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  // Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
  // Relevant parts of Jasmine's API are below so they can be changed and removed over time.
  // This file can't reference jasmine.d.ts since the globals aren't compatible.
  @scala.inline
  def spyOn[T](`object`: T, method: /* keyof T */ java.lang.String): typingsSlinky.jest.mod.jasmine.Spy = (typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jest.mod.jasmine.Spy]
  
  @scala.inline
  def test: typingsSlinky.jest.mod.jest.It = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("test").asInstanceOf[typingsSlinky.jest.mod.jest.It]
  @scala.inline
  def test_=(x: typingsSlinky.jest.mod.jest.It): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def xdescribe: typingsSlinky.jest.mod.jest.Describe = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xdescribe").asInstanceOf[typingsSlinky.jest.mod.jest.Describe]
  @scala.inline
  def xdescribe_=(x: typingsSlinky.jest.mod.jest.Describe): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def xit: typingsSlinky.jest.mod.jest.It = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xit").asInstanceOf[typingsSlinky.jest.mod.jest.It]
  @scala.inline
  def xit_=(x: typingsSlinky.jest.mod.jest.It): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def xtest: typingsSlinky.jest.mod.jest.It = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xtest").asInstanceOf[typingsSlinky.jest.mod.jest.It]
  @scala.inline
  def xtest_=(x: typingsSlinky.jest.mod.jest.It): scala.Unit = typingsSlinky.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xtest")(x.asInstanceOf[js.Any])
}
