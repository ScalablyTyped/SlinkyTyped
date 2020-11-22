package typingsSlinky.jestEach

import typingsSlinky.jestEach.anon.Describe
import typingsSlinky.jestEach.bindMod.GlobalCallback
import typingsSlinky.jestTypes.globalMod.EachTable
import typingsSlinky.jestTypes.globalMod.EachTestFn
import typingsSlinky.jestTypes.globalMod.TemplateData
import typingsSlinky.jestTypes.globalMod.TestCallback
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  @js.native
  object default extends js.Object {
    
    def apply(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Global.TemplateData is not an array type */ data: TemplateData
    ): ReturnType[
        js.Function3[/* g */ Global, /* table */ EachTable, /* data */ TemplateData, Describe]
      ] = js.native
    
    def withGlobal(g: Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe] = js.native
  }
  
  type Global = typingsSlinky.jestTypes.globalMod.Global
}
