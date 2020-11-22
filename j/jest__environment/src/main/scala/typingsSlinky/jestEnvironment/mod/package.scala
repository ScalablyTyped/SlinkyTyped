package typingsSlinky.jestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JestMockFn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.fn */ js.Any
  
  type JestMockSpyOn = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jestMock.spyOn */ js.Any
  
  type Module = typingsSlinky.node.NodeModule
  
  type ModuleWrapper = js.ThisFunction8[
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* this */ js.Any, 
    /* module */ typingsSlinky.jestEnvironment.mod.Module, 
    /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ /* exports */ js.Any, 
    /* require */ typingsSlinky.node.NodeJS.Require with (js.Function1[/* id */ java.lang.String, _]), 
    /* __dirname */ java.lang.String, 
    /* __filename */ java.lang.String, 
    /* global */ typingsSlinky.jestTypes.globalMod.Global, 
    /* jest */ js.UndefOr[typingsSlinky.jestEnvironment.mod.Jest], 
    /* repeated */ js.UndefOr[
      (js.Function0[
        js.Any | js.Array[js.Any] | scala.Boolean | scala.Double | js.Error | js.EvalError | js.RangeError | js.ReferenceError | java.lang.String | js.SyntaxError | js.TypeError | js.URIError | scala.Unit
      ]) | (typingsSlinky.jestTypes.globalMod.ItBase with typingsSlinky.jestEnvironment.anon.FnCall) | (js.Function2[
        (/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit]) | (/* s */ java.lang.String), 
        (/* repeated */ js.Any) | (/* radix */ scala.Double), 
        scala.Double | typingsSlinky.node.NodeJS.Immediate
      ]) | (typingsSlinky.std.DataViewConstructor with (org.scalablytyped.runtime.Instantiable1[/* buffer */ typingsSlinky.std.ArrayBufferLike, js.typedarray.DataView])) | (typingsSlinky.std.Float32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Float32Array])) | (typingsSlinky.std.Int8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Int8Array])) | typingsSlinky.std.WeakSetConstructor | (js.Function1[
        (/* uriComponent */ scala.Boolean) | (/* number */ scala.Double) | (/* callback */ js.Function0[scala.Unit]) | (/* immediateId */ typingsSlinky.node.NodeJS.Immediate) | (/* pattern */ js.RegExp) | (/* encodedURI */ java.lang.String) | (/* timeoutId */ typingsSlinky.node.NodeJS.Timeout), 
        js.Any | scala.Boolean | scala.Double | js.Function | js.RegExp | java.lang.String | scala.Unit
      ]) | (typingsSlinky.std.Uint32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Uint32Array])) | typingsSlinky.node.NodeJS.Global | (typingsSlinky.std.Uint8ClampedArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Uint8ClampedArray])) | (typingsSlinky.std.Float64ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Float64Array])) | (typingsSlinky.std.Int16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Int16Array])) | scala.Double | typingsSlinky.std.SetConstructor | (typingsSlinky.jestTypes.globalMod.Describe with (js.Function2[
        /* blockName */ typingsSlinky.jestTypes.globalMod.BlockName, 
        /* blockFn */ typingsSlinky.jestTypes.globalMod.BlockFn, 
        scala.Unit
      ])) | typingsSlinky.std.JSON | (typingsSlinky.jestTypes.anon.ItBaseconcurrentItConcurr with typingsSlinky.jestEnvironment.anon.FnCall) | js.Function | (typingsSlinky.jestTypes.globalMod.ItConcurrent with typingsSlinky.jestEnvironment.anon.FnCall) | typingsSlinky.istanbulLibCoverage.mod.CoverageMapData | typingsSlinky.node.anon.TypeofBuffer | (typingsSlinky.std.Uint8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Uint8Array])) | (typingsSlinky.std.Int32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Int32Array])) | (typingsSlinky.std.PromiseConstructor with (org.scalablytyped.runtime.Instantiable1[
        /* executor */ js.Function2[
          /* resolve */ js.Function1[
            /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
            scala.Unit
          ], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ], 
        js.Promise[js.Object]
      ])) | (typingsSlinky.std.Uint16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ js.Iterable[scala.Double], js.typedarray.Uint16Array])) | typingsSlinky.std.Math | (js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
        /* ms */ scala.Double, 
        /* repeated */ js.Any, 
        typingsSlinky.node.NodeJS.Timeout
      ]) | typingsSlinky.jestTypes.globalMod.Jasmine | js.Any | (typingsSlinky.jestTypes.globalMod.DescribeBase with (js.Function2[
        /* blockName */ typingsSlinky.jestTypes.globalMod.BlockName, 
        /* blockFn */ typingsSlinky.jestTypes.globalMod.BlockFn, 
        scala.Unit
      ])) | typingsSlinky.std.WeakMapConstructor | (typingsSlinky.jestTypes.globalMod.HookBase with typingsSlinky.jestEnvironment.anon.FnCallFnTimeout) | (typingsSlinky.std.ArrayBufferConstructor with (org.scalablytyped.runtime.Instantiable1[/* byteLength */ scala.Double, js.typedarray.ArrayBuffer])) | typingsSlinky.std.MapConstructor
    ], 
    js.Any
  ]
}
