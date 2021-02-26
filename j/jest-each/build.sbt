organization := "org.scalablytyped.slinky"
name := "jest-each"
version := "26.6.2-aa9768"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-6ff262",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-c42a24",
  "org.scalablytyped.slinky" %%% "istanbul-reports" % "3.0-dt-20200720Z-fbf87f",
  "org.scalablytyped.slinky" %%% "jest__types" % "26.6.2-b224e8",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
