organization := "org.scalablytyped.slinky"
name := "babel-jest"
version := "26.6.3-862347"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20201102Z-0501ac",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20200925Z-62037d",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-9a5e63",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.4-dt-20201112Z-893bca",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200925Z-ce0cf3",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-cdf83e",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-910fb5",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-3a73b1",
  "org.scalablytyped.slinky" %%% "istanbul-reports" % "3.0-dt-20200720Z-e60b33",
  "org.scalablytyped.slinky" %%% "jest__transform" % "26.6.2-6295b5",
  "org.scalablytyped.slinky" %%% "jest__types" % "26.6.2-bf45bc",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
