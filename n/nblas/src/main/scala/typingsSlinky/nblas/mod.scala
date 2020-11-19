package typingsSlinky.nblas

import typingsSlinky.nblas.typesMod.FloatArray
import typingsSlinky.nblas.typesMod.MatrixLeftRight
import typingsSlinky.nblas.typesMod.MatrixTrans
import typingsSlinky.nblas.typesMod.MatrixUnit
import typingsSlinky.nblas.typesMod.MatrixUpperLower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nblas", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ConjTrans: MatrixTrans = js.native
  
  val Left: MatrixLeftRight = js.native
  
  val Lower: MatrixUpperLower = js.native
  
  val NoTrans: MatrixTrans = js.native
  
  val NonUnit: MatrixUnit = js.native
  
  val Right: MatrixLeftRight = js.native
  
  val Trans: MatrixTrans = js.native
  
  val Unit: MatrixUnit = js.native
  
  val Upper: MatrixUpperLower = js.native
  
  val asum: js.Function1[/* x */ FloatArray, Double] = js.native
  
  val axpy: js.Function3[/* x */ FloatArray, /* y */ FloatArray, /* a */ js.UndefOr[Double], scala.Unit] = js.native
  
  val caxpy: js.Function6[
    /* n */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val ccopy: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val cgbmv: js.Function13[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val cgemm: js.Function13[
    /* transa */ MatrixTrans, 
    /* transb */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val cgemv: js.Function11[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val copy: js.Function2[/* x */ FloatArray, /* y */ FloatArray, scala.Unit] = js.native
  
  val cscal: js.Function4[
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val cswap: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val csymm: js.Function12[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val csyr2k: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val csyrk: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* beta */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val ctbmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ctbsv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ctpmv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ctpsv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ctrmm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val ctrmv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ctrsm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float32Array, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val ctrsv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dasum: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val daxpy: js.Function6[
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dcopy: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val ddot: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    Double
  ] = js.native
  
  val dgbmv: js.Function13[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dgemm: js.Function13[
    /* transa */ MatrixTrans, 
    /* transb */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val dgemv: js.Function11[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dger: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val dnrm2: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val dot: js.Function2[/* x */ FloatArray, /* y */ FloatArray, Double] = js.native
  
  val drot: js.Function7[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    /* c */ Double, 
    /* s */ Double, 
    scala.Unit
  ] = js.native
  
  val drotg: js.Function4[
    /* a */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* s */ js.typedarray.Float64Array, 
    scala.Unit
  ] = js.native
  
  val drotm: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val drotmg: js.Function5[
    /* d1 */ js.typedarray.Float64Array, 
    /* d2 */ js.typedarray.Float64Array, 
    /* x1 */ js.typedarray.Float64Array, 
    /* y1 */ js.typedarray.Float64Array, 
    /* param */ js.typedarray.Float64Array, 
    scala.Unit
  ] = js.native
  
  val dsbmv: js.Function11[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dscal: js.Function4[
    /* n */ Double, 
    /* a */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dspmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dspr: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    scala.Unit
  ] = js.native
  
  val dspr2: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    scala.Unit
  ] = js.native
  
  val dswap: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dsymm: js.Function12[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val dsymv: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val dsyr: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val dsyr2: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val dsyr2k: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val dsyrk: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val dtbmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dtbsv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dtpmv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dtpsv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dtrmm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val dtrmv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dtrsm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val dtrsv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val dzasum: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val dznrm2: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val gbmv: js.Function8[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* kl */ js.UndefOr[Double], 
    /* ku */ js.UndefOr[Double], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    /* trans */ js.UndefOr[MatrixTrans], 
    scala.Unit
  ] = js.native
  
  val gemm: js.Function10[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* c */ FloatArray, 
    /* m */ Double, 
    /* n */ Double, 
    /* k */ Double, 
    /* transa */ js.UndefOr[MatrixTrans], 
    /* transb */ js.UndefOr[MatrixTrans], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val gemv: js.Function6[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    /* trans */ js.UndefOr[MatrixTrans], 
    scala.Unit
  ] = js.native
  
  val ger: js.Function4[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val iamax: js.Function1[/* x */ FloatArray, Double] = js.native
  
  val icamax: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val idamax: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val isamax: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val izamax: js.Function3[/* n */ Double, /* x */ js.typedarray.Float64Array, /* incx */ Double, Double] = js.native
  
  val nrm2: js.Function1[/* x */ FloatArray, Double] = js.native
  
  val rot: js.Function4[/* x */ FloatArray, /* y */ FloatArray, /* c */ Double, /* s */ Double, scala.Unit] = js.native
  
  val rotg: js.Function4[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* c */ FloatArray, 
    /* s */ FloatArray, 
    scala.Unit
  ] = js.native
  
  val rotm: js.Function3[/* x */ FloatArray, /* y */ FloatArray, /* param */ FloatArray, scala.Unit] = js.native
  
  val rotmg: js.Function5[
    /* d1 */ FloatArray, 
    /* d2 */ FloatArray, 
    /* x1 */ FloatArray, 
    /* y1 */ FloatArray, 
    /* param */ FloatArray, 
    scala.Unit
  ] = js.native
  
  val sasum: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val saxpy: js.Function6[
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sbmv: js.Function7[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* k */ js.UndefOr[Double], 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val scal: js.Function2[/* x */ FloatArray, /* a */ Double, scala.Unit] = js.native
  
  val scasum: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val scnrm2: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val scopy: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sdot: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    Double
  ] = js.native
  
  val sgbmv: js.Function13[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sgemm: js.Function13[
    /* transa */ MatrixTrans, 
    /* transb */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val sgemv: js.Function11[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sger: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val snrm2: js.Function3[/* n */ Double, /* x */ js.typedarray.Float32Array, /* incx */ Double, Double] = js.native
  
  val spmv: js.Function6[
    /* ap */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val spr: js.Function4[
    /* ap */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val spr2: js.Function5[
    /* ap */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val srot: js.Function7[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    /* c */ Double, 
    /* s */ Double, 
    scala.Unit
  ] = js.native
  
  val srotg: js.Function4[
    /* a */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* s */ js.typedarray.Float32Array, 
    scala.Unit
  ] = js.native
  
  val srotm: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val srotmg: js.Function5[
    /* d1 */ js.typedarray.Float32Array, 
    /* d2 */ js.typedarray.Float32Array, 
    /* x1 */ js.typedarray.Float32Array, 
    /* y1 */ js.typedarray.Float32Array, 
    /* param */ js.typedarray.Float32Array, 
    scala.Unit
  ] = js.native
  
  val ssbmv: js.Function11[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sscal: js.Function4[
    /* n */ Double, 
    /* a */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val sspmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val sspr: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    scala.Unit
  ] = js.native
  
  val sspr2: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    scala.Unit
  ] = js.native
  
  val sswap: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val ssymm: js.Function12[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val ssymv: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* beta */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val ssyr: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val ssyr2: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float32Array, 
    /* incy */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    scala.Unit
  ] = js.native
  
  val ssyr2k: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val ssyrk: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* beta */ Double, 
    /* c */ js.typedarray.Float32Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val stbmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val stbsv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val stpmv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val stpsv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val strmm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val strmv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val strsm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val strsv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val swap: js.Function2[/* x */ FloatArray, /* y */ FloatArray, scala.Unit] = js.native
  
  val symm: js.Function9[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* c */ FloatArray, 
    /* m */ Double, 
    /* n */ Double, 
    /* side */ js.UndefOr[MatrixLeftRight], 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val symv: js.Function6[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val syr: js.Function4[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val syr2: js.Function5[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* y */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val syr2k: js.Function9[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* c */ FloatArray, 
    /* n */ Double, 
    /* k */ Double, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val syrk: js.Function8[
    /* a */ FloatArray, 
    /* c */ FloatArray, 
    /* n */ FloatArray, 
    /* k */ Double, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* alpha */ js.UndefOr[Double], 
    /* beta */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val tbmv: js.Function5[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val tbsv: js.Function5[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val tpmv: js.Function5[
    /* ap */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val tpsv: js.Function5[
    /* ap */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val trmm: js.Function9[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* m */ Double, 
    /* n */ Double, 
    /* side */ js.UndefOr[MatrixLeftRight], 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* transa */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val trmv: js.Function5[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val trsm: js.Function9[
    /* a */ FloatArray, 
    /* b */ FloatArray, 
    /* m */ Double, 
    /* n */ Double, 
    /* side */ js.UndefOr[MatrixLeftRight], 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* transa */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    /* alpha */ js.UndefOr[Double], 
    scala.Unit
  ] = js.native
  
  val trsv: js.Function5[
    /* a */ FloatArray, 
    /* x */ FloatArray, 
    /* uplo */ js.UndefOr[MatrixUpperLower], 
    /* trans */ js.UndefOr[MatrixTrans], 
    /* diag */ js.UndefOr[MatrixUnit], 
    scala.Unit
  ] = js.native
  
  val zaxpy: js.Function6[
    /* n */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val zcopy: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val zgbmv: js.Function13[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val zgemm: js.Function13[
    /* transa */ MatrixTrans, 
    /* transb */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val zgemv: js.Function11[
    /* trans */ MatrixTrans, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val zscal: js.Function4[
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val zswap: js.Function5[
    /* n */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    /* y */ js.typedarray.Float64Array, 
    /* incy */ Double, 
    scala.Unit
  ] = js.native
  
  val zsymm: js.Function12[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val zsyr2k: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val zsyrk: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* k */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* beta */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* ldc */ Double, 
    scala.Unit
  ] = js.native
  
  val ztbmv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ztbsv: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* k */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ztpmv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ztpsv: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ztrmm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val ztrmv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
  
  val ztrsm: js.Function11[
    /* side */ MatrixLeftRight, 
    /* uplo */ MatrixUpperLower, 
    /* transa */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* m */ Double, 
    /* n */ Double, 
    /* alpha */ js.typedarray.Float64Array, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    scala.Unit
  ] = js.native
  
  val ztrsv: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* incx */ Double, 
    scala.Unit
  ] = js.native
}
