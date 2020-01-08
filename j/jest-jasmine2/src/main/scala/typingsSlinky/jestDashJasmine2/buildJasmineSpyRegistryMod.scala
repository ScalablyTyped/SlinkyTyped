package typingsSlinky.jestDashJasmine2

import typingsSlinky.jestDashJasmine2.buildTypesMod.Spy
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.configurable
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.enumerable
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.get
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.set
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.value
import typingsSlinky.jestDashJasmine2.jestDashJasmine2Strings.writable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/spyRegistry", JSImport.Namespace)
@js.native
object buildJasmineSpyRegistryMod extends js.Object {
  @js.native
  trait SpyRegistry extends js.Object {
    var _spyOnProperty: js.Any = js.native
    var respy: js.Any = js.native
    def allowRespy(allow: js.Any): Unit = js.native
    def clearSpies(): Unit = js.native
    def spyOn(obj: Record[String, _], methodName: String): Spy = js.native
    @JSName("spyOn")
    def spyOn_configurable(obj: Record[String, _], methodName: String, accessType: configurable): Spy = js.native
    @JSName("spyOn")
    def spyOn_enumerable(obj: Record[String, _], methodName: String, accessType: enumerable): Spy = js.native
    @JSName("spyOn")
    def spyOn_get(obj: Record[String, _], methodName: String, accessType: get): Spy = js.native
    @JSName("spyOn")
    def spyOn_set(obj: Record[String, _], methodName: String, accessType: set): Spy = js.native
    @JSName("spyOn")
    def spyOn_value(obj: Record[String, _], methodName: String, accessType: value): Spy = js.native
    @JSName("spyOn")
    def spyOn_writable(obj: Record[String, _], methodName: String, accessType: writable): Spy = js.native
  }
  
  @js.native
  class default () extends SpyRegistry {
    def this(hasCurrentSpies: Anon_CurrentSpies) = this()
  }
  
}

