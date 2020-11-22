organization := "org.scalablytyped.slinky"
name := "jest-config"
version := "26.6.3-64a351"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-910fb5",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-3a73b1",
  "org.scalablytyped.slinky" %%% "istanbul-reports" % "3.0-dt-20200720Z-e60b33",
  "org.scalablytyped.slinky" %%% "jest-validate" % "26.6.2-d1f52b",
  "org.scalablytyped.slinky" %%% "jest__types" % "26.6.2-bf45bc",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
