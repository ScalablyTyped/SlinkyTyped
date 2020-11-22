organization := "org.scalablytyped.slinky"
name := "globalize-compiler"
version := "v0.2.0-dt-20201002Z-58b56a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200923Z-ef6a59",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20201002Z-4d08ba",
  "org.scalablytyped.slinky" %%% "globalize" % "1.5-dt-20201002Z-c42821",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
