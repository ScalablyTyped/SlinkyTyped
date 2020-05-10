package typingsSlinky.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiLiteStatic extends js.Object {
  var factory: FactoryEnum = js.native
  var strategy: StrategyEnum = js.native
  var utils: Utils = js.native
  var version: String = js.native
  def createContext(): CreateContext = js.native
  def dependencyExpression(depExp: String): String = js.native
  def entry(name: String, ctx: CreateContext): js.Any = js.native
}

object DiLiteStatic {
  @scala.inline
  def apply(
    createContext: () => CreateContext,
    dependencyExpression: String => String,
    entry: (String, CreateContext) => js.Any,
    factory: FactoryEnum,
    strategy: StrategyEnum,
    utils: Utils,
    version: String
  ): DiLiteStatic = {
    val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext), dependencyExpression = js.Any.fromFunction1(dependencyExpression), entry = js.Any.fromFunction2(entry), factory = factory.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiLiteStatic]
  }
  @scala.inline
  implicit class DiLiteStaticOps[Self <: DiLiteStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateContext(value: () => CreateContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDependencyExpression(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntry(value: (String, CreateContext) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFactory(value: FactoryEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: StrategyEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Utils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

