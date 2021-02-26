package typingsSlinky.jestEach

import typingsSlinky.jestEach.anon.Arguments
import typingsSlinky.jestTypes.globalMod.ConcurrentTestFn
import typingsSlinky.jestTypes.globalMod.EachTable
import typingsSlinky.jestTypes.globalMod.EachTestFn
import typingsSlinky.jestTypes.globalMod.TemplateData
import typingsSlinky.jestTypes.globalMod.TestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  @JSImport("jest-each/build/bind", JSImport.Default)
  @js.native
  def default[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  @JSImport("jest-each/build/bind", JSImport.Default)
  @js.native
  def default[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  type EachTests = js.Array[Arguments]
  
  type GlobalCallback = js.Function3[
    /* testName */ String, 
    /* fn */ ConcurrentTestFn, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
}
